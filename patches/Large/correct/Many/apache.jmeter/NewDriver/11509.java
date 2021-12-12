diff --git a/src/core/org/apache/jmeter/NewDriver.java b/src/core/org/apache/jmeter/NewDriver.java
index dc2fc3a..345b449 100644
--- a/src/core/org/apache/jmeter/NewDriver.java
+++ b/src/core/org/apache/jmeter/NewDriver.java
@@ -52,7 +52,7 @@
     private static final DynamicClassLoader loader;
 
     /** The directory JMeter is installed in. */
-    private static final String jmDir;
+    private static final String JMETER_INSTALLATION_DIRECTORY;
 
     private static final List<Exception> EXCEPTIONS_IN_INIT = new ArrayList<>();
 
@@ -80,7 +80,7 @@
                 tmpDir = userDir.getAbsoluteFile().getParent();
             }
         }
-        jmDir=tmpDir;
+        JMETER_INSTALLATION_DIRECTORY=tmpDir;
 
         /*
          * Does the system support UNC paths? If so, may need to fix them up
@@ -90,9 +90,9 @@
 
         // Add standard jar locations to initial classpath
         StringBuilder classpath = new StringBuilder();
-        File[] libDirs = new File[] { new File(jmDir + File.separator + "lib"),// $NON-NLS-1$ $NON-NLS-2$
-                new File(jmDir + File.separator + "lib" + File.separator + "ext"),// $NON-NLS-1$ $NON-NLS-2$
-                new File(jmDir + File.separator + "lib" + File.separator + "junit")};// $NON-NLS-1$ $NON-NLS-2$
+        File[] libDirs = new File[] { new File(JMETER_INSTALLATION_DIRECTORY + File.separator + "lib"),// $NON-NLS-1$ $NON-NLS-2$
+                new File(JMETER_INSTALLATION_DIRECTORY + File.separator + "lib" + File.separator + "ext"),// $NON-NLS-1$ $NON-NLS-2$
+                new File(JMETER_INSTALLATION_DIRECTORY + File.separator + "lib" + File.separator + "junit")};// $NON-NLS-1$ $NON-NLS-2$
         for (File libDir : libDirs) {
             File[] libJars = libDir.listFiles(new FilenameFilter() {
                 @Override
@@ -230,7 +230,7 @@
      * @return the directory where JMeter is installed.
      */
     public static String getJMeterDir() {
-        return jmDir;
+        return JMETER_INSTALLATION_DIRECTORY;
     }
 
     /**
@@ -245,7 +245,7 @@
         } else {
             Thread.currentThread().setContextClassLoader(loader);
             if (System.getProperty("log4j.configuration") == null) {// $NON-NLS-1$ $NON-NLS-2$
-                File conf = new File(jmDir, "bin" + File.separator + "log4j.conf");// $NON-NLS-1$ $NON-NLS-2$
+                File conf = new File(JMETER_INSTALLATION_DIRECTORY, "bin" + File.separator + "log4j.conf");// $NON-NLS-1$ $NON-NLS-2$
                 System.setProperty("log4j.configuration", "file:" + conf);
             }
     
@@ -256,7 +256,7 @@
                 startup.invoke(instance, new Object[] { args });
             } catch(Throwable e){ // NOSONAR We want to log home directory in case of exception
                 e.printStackTrace(); // NOSONAR No logger at this step
-                System.err.println("JMeter home directory was detected as: "+jmDir);
+                System.err.println("JMeter home directory was detected as: "+JMETER_INSTALLATION_DIRECTORY);
             }
         }
     }
