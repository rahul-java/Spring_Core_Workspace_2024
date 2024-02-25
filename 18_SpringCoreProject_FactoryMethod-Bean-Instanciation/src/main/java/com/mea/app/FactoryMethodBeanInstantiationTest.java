package com.mea.app;

import java.util.Calendar;
import java.util.Properties;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

public class FactoryMethodBeanInstantiationTest 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        //create IOC container
        DefaultListableBeanFactory factory = new DefaultListableBeanFactory();
        XmlBeanDefinitionReader reader = new XmlBeanDefinitionReader(factory);
        reader.loadBeanDefinitions("com/mea/cfgs/applicationContext.xml");
        
        Class classObj = factory.getBean("c1",Class.class);
        System.out.println("Class obj data :: "+classObj.toString() +" ::: "+classObj.getClass());
        System.out.println("---------------------------------------------------------------");
        
        Calendar calendar = factory.getBean("cal",Calendar.class);
        System.out.println("Calendar obj data :: "+calendar.toString() +" ::: "+calendar.getClass());
        System.out.println("---------------------------------------------------------------");
        
        Properties properties = factory.getBean("props",Properties.class);
        System.out.println("Properties obj data :: "+properties.toString() +" ::: "+properties.getClass());
        System.out.println("=================================================================");
        
        
        String str = factory.getBean("s2",String.class);
        System.out.println("String obj data :: "+str.toString() +" ::: "+str.getClass());
        System.out.println("================================================================");
        
        
        String subString = factory.getBean("s3",String.class);
        System.out.println("String obj data :: "+subString.toString() +" ::: "+subString.getClass());
        System.out.println("=================================================================");
        
        
        
    }
}

/*
Class obj data :: class java.util.Date ::: class java.lang.Class
---------------------------------------------------------------
Calendar obj data :: java.util.GregorianCalendar[time=1708881200865,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id="Asia/Calcutta",offset=19800000,dstSavings=0,useDaylight=false,transitions=7,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2024,MONTH=1,WEEK_OF_YEAR=9,WEEK_OF_MONTH=5,DAY_OF_MONTH=25,DAY_OF_YEAR=56,DAY_OF_WEEK=1,DAY_OF_WEEK_IN_MONTH=4,AM_PM=1,HOUR=10,HOUR_OF_DAY=22,MINUTE=43,SECOND=20,MILLISECOND=865,ZONE_OFFSET=19800000,DST_OFFSET=0] ::: class java.util.GregorianCalendar
---------------------------------------------------------------
Properties obj data :: {java.specification.version=18, sun.cpu.isalist=amd64, sun.jnu.encoding=Cp1252, java.class.path=C:\Spring_Core_Workspace_2024\18_SpringCoreProject_FactoryMethod-Bean-Instanciation\target\classes;C:\Users\hp\.m2\repository\org\springframework\spring-context-support\5.3.19\spring-context-support-5.3.19.jar;C:\Users\hp\.m2\repository\org\springframework\spring-beans\5.3.19\spring-beans-5.3.19.jar;C:\Users\hp\.m2\repository\org\springframework\spring-context\5.3.19\spring-context-5.3.19.jar;C:\Users\hp\.m2\repository\org\springframework\spring-aop\5.3.19\spring-aop-5.3.19.jar;C:\Users\hp\.m2\repository\org\springframework\spring-expression\5.3.19\spring-expression-5.3.19.jar;C:\Users\hp\.m2\repository\org\springframework\spring-core\5.3.19\spring-core-5.3.19.jar;C:\Users\hp\.m2\repository\org\springframework\spring-jcl\5.3.19\spring-jcl-5.3.19.jar, java.vm.vendor=Oracle Corporation, sun.arch.data.model=64, user.variant=, java.vendor.url=https://java.oracle.com/, user.timezone=Asia/Calcutta, java.vm.specification.version=18, os.name=Windows 10, sun.java.launcher=SUN_STANDARD, user.country=IN, sun.boot.library.path=C:\Program Files\Java\jdk-18\bin, sun.java.command=com.mea.app.FactoryMethodBeanInstantiationTest, jdk.debug=release, sun.cpu.endian=little, user.home=C:\Users\hp, user.language=en, java.specification.vendor=Oracle Corporation, java.version.date=2022-03-22, java.home=C:\Program Files\Java\jdk-18, file.separator=\, java.vm.compressedOopsMode=Zero based, line.separator=
, java.vm.specification.vendor=Oracle Corporation, java.specification.name=Java Platform API Specification, user.script=, sun.management.compiler=HotSpot 64-Bit Tiered Compilers, java.runtime.version=18+36-2087, user.name=hp, stdout.encoding=UTF-8, path.separator=;, os.version=10.0, java.runtime.name=Java(TM) SE Runtime Environment, file.encoding=UTF-8, java.vm.name=Java HotSpot(TM) 64-Bit Server VM, java.vendor.url.bug=https://bugreport.java.com/bugreport/, java.io.tmpdir=C:\Users\hp\AppData\Local\Temp\, java.version=18, user.dir=C:\Spring_Core_Workspace_2024\18_SpringCoreProject_FactoryMethod-Bean-Instanciation, os.arch=amd64, java.vm.specification.name=Java Virtual Machine Specification, sun.os.patch.level=, native.encoding=Cp1252, java.library.path=C:\Program Files\Java\jdk-18\bin;C:\Windows\Sun\Java\bin;C:\Windows\system32;C:\Windows;F:\Oracle21C\Oracle21c_db_home\bin;C:\Program Files\Common Files\Oracle\Java\javapath;C:\Windows\system32;C:\Windows;C:\Windows\System32\Wbem;C:\Windows\System32\WindowsPowerShell\v1.0\;C:\Windows\System32\OpenSSH\;C:\Program Files\MongoDB\Server\6.0\bin;C:\Program Files\Java\jdk-18\bin;C:\apache-maven-3.9.3\bin;C:\Program Files\Git\cmd;C:\Program Files\PuTTY\;C:\Program Files\nodejs\;C:\Users\hp\AppData\Local\Microsoft\WindowsApps;;C:\Microsoft VS Code\bin;C:\Program Files\heroku\bin;C:\Users\hp\AppData\Roaming\npm;., java.vm.info=mixed mode, sharing, stderr.encoding=UTF-8, java.vendor=Oracle Corporation, java.vm.version=18+36-2087, sun.io.unicode.encoding=UnicodeLittle, java.class.version=62.0} ::: class java.util.Properties
=================================================================
String obj data :: hello12345 ::: class java.lang.String
================================================================
String obj data :: how ar ::: class java.lang.String
=================================================================
*/