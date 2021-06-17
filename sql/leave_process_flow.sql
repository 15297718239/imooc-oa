-- ----------------------------
-- Table structure for adm_leave_form
-- ----------------------------
DROP TABLE IF EXISTS `adm_leave_form`;
CREATE TABLE `adm_leave_form`  (
                                   `form_id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '请假单编号',
                                   `employee_id` bigint(20) NOT NULL COMMENT '员工编号',
                                   `form_type` int(255) NOT NULL COMMENT '请假类型 1-事假 2-病假 3-工伤假 4-婚假 5-产假 6-丧假',
                                   `start_time` datetime(0) NOT NULL COMMENT '请假起始时间',
                                   `end_time` datetime(0) NOT NULL COMMENT '请假结束时间',
                                   `reason` varchar(128) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL COMMENT '请假事由',
                                   `create_time` datetime(0) NOT NULL COMMENT '创建时间',
                                   `state` varchar(32) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL COMMENT 'processing-正在审批 approved-审批已通过 refused-审批被驳回',
                                   PRIMARY KEY (`form_id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 40 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci ROW_FORMAT = Dynamic;


-- ----------------------------
-- Table structure for adm_process_flow
-- ----------------------------
DROP TABLE IF EXISTS `adm_process_flow`;
CREATE TABLE `adm_process_flow`  (
                                     `process_id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '处理任务编号',
                                     `form_id` bigint(20) NOT NULL COMMENT '表单编号',
                                     `operator_id` bigint(20) NOT NULL COMMENT '经办人编号',
                                     `action` varchar(32) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL COMMENT 'apply-申请  audit-审批',
                                     `result` varchar(32) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT 'approved-同意 refused-驳回',
                                     `reason` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT '审批意见',
                                     `create_time` datetime(0) NOT NULL COMMENT '创建时间',
                                     `audit_time` datetime(0) NULL DEFAULT NULL COMMENT '审批时间',
                                     `order_no` int(11) NOT NULL COMMENT '任务序号',
                                     `state` varchar(32) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL COMMENT 'ready-准备 process-正在处理 complete-处理完成 cancel-取消',
                                     `is_last` int(255) NOT NULL COMMENT '是否最后节点,0-否 1-是',
                                     PRIMARY KEY (`process_id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 96 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for sys_notice
-- ----------------------------
DROP TABLE IF EXISTS `sys_notice`;
CREATE TABLE `sys_notice`  (
                               `notice_id` bigint(20) NOT NULL AUTO_INCREMENT,
                               `receiver_id` bigint(20) NOT NULL,
                               `content` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL,
                               `create_time` datetime(0) NOT NULL,
                               PRIMARY KEY (`notice_id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 29 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci ROW_FORMAT = Dynamic;