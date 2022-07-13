package com.sun.moon.utils;


import com.baomidou.mybatisplus.annotation.DbType;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.generator.AutoGenerator;
import com.baomidou.mybatisplus.generator.config.DataSourceConfig;
import com.baomidou.mybatisplus.generator.config.GlobalConfig;
import com.baomidou.mybatisplus.generator.config.PackageConfig;
import com.baomidou.mybatisplus.generator.config.StrategyConfig;
import com.baomidou.mybatisplus.generator.config.rules.DateType;
import com.baomidou.mybatisplus.generator.config.rules.NamingStrategy;
import com.baomidou.mybatisplus.generator.engine.FreemarkerTemplateEngine;

/**
 * @author li
 */
public class CodeGenerator {
    public static void main(String[] args) {
        //代码生成器对象
        AutoGenerator mpg = new AutoGenerator();
        //全局配置
        GlobalConfig gc = new GlobalConfig();
        String property = System.getProperty("user.dir");
        gc.setOutputDir(property + "/src/main/java");
        gc.setAuthor("liyuntao");
        gc.setOpen(false);
        gc.setIdType(IdType.ASSIGN_ID);
        gc.setDateType(DateType.ONLY_DATE);
        gc.setSwagger2(true);
        mpg.setGlobalConfig(gc);
        //设置模板
        mpg.setTemplateEngine(new FreemarkerTemplateEngine());
        //设置数据源
        DataSourceConfig dataSourceConfig = new DataSourceConfig();
        dataSourceConfig.setUrl("jdbc:mysql://localhost:3306/comment?useUnicode=true&characterEncoding=utf8");
        dataSourceConfig.setDriverName("com.mysql.cj.jdbc.Driver");
        dataSourceConfig.setUsername("root");
        dataSourceConfig.setPassword("root");

        //驱动
        dataSourceConfig.setDbType(DbType.MYSQL);
        mpg.setDataSource(dataSourceConfig);

        //包的设置
        PackageConfig packageConfig = new PackageConfig();
        packageConfig.setModuleName("moon");
        packageConfig.setParent("com.sun");
        packageConfig.setService("service");
        packageConfig.setServiceImpl("impl");
        packageConfig.setController("controller");
        packageConfig.setEntity("beans");
        packageConfig.setMapper("mapper");
        mpg.setPackageInfo(packageConfig);


        // 策略配置
        StrategyConfig strategy = new StrategyConfig();
        strategy.setInclude("discuss_post");
        strategy.setNaming(NamingStrategy.underline_to_camel);
        strategy.setColumnNaming(NamingStrategy.underline_to_camel);
        //  strategy.setSuperEntityClass("你自己的父类实体,没有就不用设置!");
        strategy.setEntityLombokModel(true);
        //strategy.setRestControllerStyle(true);
        mpg.setStrategy(strategy);
        //执行
        mpg.execute();
    }
}
