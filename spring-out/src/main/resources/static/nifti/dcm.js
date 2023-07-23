//加载cornerstoneNIFTIImageLoader.js
cornerstoneWADOImageLoader.external.cornerstone = cornerstone;

//加载cornerstoneTools工具
cornerstoneTools.external.cornerstone = cornerstone;
cornerstoneTools.external.Hammer = Hammer;
cornerstoneTools.external.cornerstoneMath = cornerstoneMath;
cornerstoneTools.init();
const firstElement = document.querySelector('.cornerstone-element1');
cornerstone.enable(firstElement);
const secondElement = document.querySelector('.cornerstone-element2');
cornerstone.enable(secondElement);



//从前端获取文件名字在这里执行

    const scheme = 'wadouri';
    const baseUrl = `/Files/Dicom/hr/`;
    const firstSeries = 'wadouri:/Files/Dicom/hr/1-1.dcm';
    const secondSeries = [];

    for (let i = 1; i <= 230; i++) {
        let number = i.toString().padStart(3, '0'); // 将数字格式化为三位数，并在前面补零
        let filename = `1-${number}.dcm`;
        secondSeries.push(filename);
    }

    const firstStack = {
            currentImageIdIndex: 0,
            imageIds: firstSeries=> `${scheme}:${baseUrl}${firstSeries}`
        };
    const secondStack = {
            currentImageIdIndex: 0,
            imageIds: secondSeries
                .map(seriesImage => `${scheme}:${baseUrl}${seriesImage}`)
        };
// Create the synchronizer
const synchronizer = new cornerstoneTools.Synchronizer(
    // Cornerstone event that should trigger synchronizer
    'cornerstonenewimage',
    // Logic that should run on target elements when event is observed on source elements
    cornerstoneTools.updateImageSynchronizer
)
    // Add and activate tools
cornerstoneTools.addTool(cornerstoneTools.StackScrollTool);
cornerstoneTools.addTool(cornerstoneTools.StackScrollMouseWheelTool);
cornerstoneTools.setToolActive('StackScroll', { mouseButtonMask: 1 });
cornerstoneTools.setToolActive('StackScrollMouseWheel', { });


cornerstoneTools.addTool(cornerstoneTools.CrosshairsTool);

// load images and set the stack
    const firstLoadImagePromise = cornerstone.loadImage(firstSeries)
        .then((image) => {

            cornerstone.displayImage(firstElement, image)

            // set the stack as tool state
            synchronizer.add(firstElement)
            cornerstoneTools.addStackStateManager(firstStack, ['stack', 'Crosshairs'])
            cornerstoneTools.addToolState(firstElement, 'stack', firstStack)
        })

const secondLoadImagePromise = cornerstone.loadImage(secondStack.imageIds[0])
    .then((image) => {
        cornerstone.displayImage(secondElement, image)

        // set the stack as tool state
        synchronizer.add(secondElement);
        cornerstoneTools.addStackStateManager(secondElement, ['stack', 'Crossairs']);
        cornerstoneTools.addToolState(secondElement, 'stack', secondStack);
        cornerstoneTools.setToolActive('Crosshairs', {
            mouseButtonMask: 1,
            synchronizationContext: synchronizer,
        });
    })

// After images have loaded, and our sync context has added both elements
Promise.all([firstLoadImagePromise, secondLoadImagePromise])
    .then(() => {

        cornerstoneTools.setToolActive('Crosshairs', {
            mouseButtonMask: 1,
            synchronizationContext: synchronizer,
        });
    });
