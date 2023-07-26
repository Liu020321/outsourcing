/*
 Navicat Premium Data Transfer

 Source Server         : MySQL
 Source Server Type    : MySQL
 Source Server Version : 80031 (8.0.31)
 Source Host           : localhost:3306
 Source Schema         : outsourcing

 Target Server Type    : MySQL
 Target Server Version : 80031 (8.0.31)
 File Encoding         : 65001

 Date: 26/07/2023 17:17:50
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for viewresult
-- ----------------------------
DROP TABLE IF EXISTS `viewresult`;
CREATE TABLE `viewresult`  (
  `id` int NOT NULL AUTO_INCREMENT,
  `name` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL,
  `fileName` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL,
  `date` date NULL DEFAULT NULL,
  `describe` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 49 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of viewresult
-- ----------------------------
INSERT INTO `viewresult` VALUES (1, '没头脑', '07f3a381-9abf-4de9-9c61-196915ea3369.nii.gz', '2023-09-01', '无');
INSERT INTO `viewresult` VALUES (2, '不高兴', 'eeb32798-486b-4663-ab5e-54d32c164485.nii.gz', '2023-09-01', '无');
INSERT INTO `viewresult` VALUES (3, '大力', 'ph.dcm', '2023-08-31', '无');
INSERT INTO `viewresult` VALUES (4, '大头', 'p1.dcm', '2023-08-30', '无');
INSERT INTO `viewresult` VALUES (5, '大哥', 'p2.dcm', '2023-08-29', '无');
INSERT INTO `viewresult` VALUES (6, '得力', 'hr.dcm', '2023-08-28', '无');
INSERT INTO `viewresult` VALUES (7, '格力', 'yr.dcm', '2023-08-27', '无');
INSERT INTO `viewresult` VALUES (8, '给力', 'tr.dcm', '2023-08-26', '无');
INSERT INTO `viewresult` VALUES (9, 'q', '02de3b59-442b-42f9-9182-0c21c5eae0de.nii.gz', '2023-10-01', '1');

SET FOREIGN_KEY_CHECKS = 1;
