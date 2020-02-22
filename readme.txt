将每个项目中的group和version提取到公用的配置中
1.新建gradle.properties文件
2.将每个项目中的group和version配置删除
    group 'com.yicj.study'
    version '1.0-SNAPSHOT'
3.在gradle.properties中增加group和version的配置
    group ='com.yicj.study'
    version = '1.0-SNAPSHOT'