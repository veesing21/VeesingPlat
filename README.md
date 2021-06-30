## VeesingPlat 介绍
VeesingPlat系统是基于springboot开发的自身优化的短信彩信系统，VeesingPlat系统更适合企业二次开发，是一款可以进行客户管理、通道管理、短信管理、彩信管理、视频短信管理、国际短信管理、费用管理、发送统计、系统管理，支持二次开发。
管理端可以开直客账户；开设代理商账户；接入HTTP短彩信接口；接入CMPP短彩信接口等等，让企业用更低的成本、更少的人力，更快的速度构建自己的短彩信平台。
对外使用可以是：HTTP接口、CMPP接口和在线使用。

## 公司介绍
上海中昱文化传播有限公司成立于2010年，一直从事于短彩信行业，此VeesingPlat系统是2017年用Java语言完成开发的，替代了之前用php语言开发的平台，多年的优化已经让此平台趋于完美。
我们用这个平台承接过大型汽车品牌以及短彩信同行渠道等的发送任务，可以说日发送上千万级数据没有多大压力。
公司官网：https://www.veesing.com/

## 导航栏目
 [帮助手册](https://www.veesing.cn/)
 | [功能清单](https://www.veesing.cn/)
 | [官网地址](https://www.veesing.cn/)
 | [Vue.js手册](https://cn.vuejs.org/)


## 技术评价
1. B/S架构
2. MVC编码架构
3. springboot
4. 支持阿里云存储
5. 支持负载均衡
6. 支持Mysql读写分离
7. 支持Redis/Memcached
8. 支持Linux/Unix/Windows服务器，支持Apache/IIS/Nginx等


## 系统功能
1. 群发短信：模版、定时发送、查询、回执、回复
2. 群发彩信：模版、定时发送、查询、回执、回复
3. 国际短信：模版、定时发送、查询、回执、回复
4. 视频短信：模版、定时发送、查询、回执、回复
5. 个性化短信：模版、定时发送、查询、回执、回复
6. 语音短信：模版、定时发送、查询、回执、回复
7. 短信验证码：模版、定时发送、查询、回执、回复

## 系统特点
1. 可视化预览编辑模式
2. 发送状态报告
3. 预警机制
4. 支持上行互动
5. 支持状态返回
6. 支持图文 视频 音频彩信
7. 退订管理

## 相关依赖SDK安装
1. jdk  1.8
2. maven 3.1+
3. mysql 5.7+     


## 安装教程
1. 将源码导入IDE
2. 新建数据库veesing_sms_open,导入./veesing_sms_open.sql
3. 修改application.yml: springboot.datasource.url springboot.datasource.username springboot.datasource.password 
4. 运行项目(IDE运行 或 [root@sasdfadaa VeesingPlat]# mvn spring-boot:run)
5. 前台地址：localhost:8080 内置账号 veesing 密码 123456

## 开源须知
1.仅允许用于个人学习研究使用;
2.个人商业使用，可以联系我们开设代理商账户
3.商业使用，需要获取上海中昱文化传播有限公司的商业授权。

