#!/bin/bash

# 激活虚拟环
export PATH="/home/lht/Environments/envs/soft/bin/:$PATH"
python --version
# 其他命令
cd /home/lht/Code/pycharm/outsourcing/PaddleSeg/contrib/MedicalSeg
python nnunet/infer.py \
--image_folder inference_model/submit \
--output_folder inference_model/output \
--plan_path inference_model/nnUNetPlansv2.1_plans_3D.pkl \
--model_paths inference_model/model.pdmodel \
--param_paths inference_model/model.pdiparams \
--postprocessing_json_path inference_model/postprocessing.json \
--model_type cascade_lowres