diff --git a/components/camel-nagios/src/test/java/org/apache/camel/component/nagios/NagiosConfiguraitonRefTest.java b/components/camel-nagios/src/test/java/org/apache/camel/component/nagios/NagiosConfiguraitonRefTest.java
index b8375af..42c0246 100644
--- a/components/camel-nagios/src/test/java/org/apache/camel/component/nagios/NagiosConfiguraitonRefTest.java
+++ b/components/camel-nagios/src/test/java/org/apache/camel/component/nagios/NagiosConfiguraitonRefTest.java
@@ -37,7 +37,7 @@
     @Before
     @Override
     public void setUp() throws Exception {
-        nagios = new NagiosNscaStub(25667, "secret");
+        nagios = new NagiosNscaStub(25668, "secret");
         nagios.start();
 
         super.setUp();
@@ -55,7 +55,7 @@
         NagiosConfiguration config = new NagiosConfiguration();
         config.setPassword("secret");
         config.setHost("127.0.0.1");
-        config.setPort(25667);
+        config.setPort(25668);
 
         JndiRegistry jndi = super.createRegistry();
         jndi.bind("nagiosConf", config);
