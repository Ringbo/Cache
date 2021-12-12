diff --git a/jetty-io/src/main/java/org/eclipse/jetty/io/nio/SelectorManager.java b/jetty-io/src/main/java/org/eclipse/jetty/io/nio/SelectorManager.java
index faf2139..52d47e0 100644
--- a/jetty-io/src/main/java/org/eclipse/jetty/io/nio/SelectorManager.java
+++ b/jetty-io/src/main/java/org/eclipse/jetty/io/nio/SelectorManager.java
@@ -49,7 +49,7 @@
     // TODO Tune these by approx system speed.
     private static final int __JVMBUG_THRESHHOLD=Integer.getInteger("org.mortbay.io.nio.JVMBUG_THRESHHOLD",512).intValue();
     private static final int __MONITOR_PERIOD=Integer.getInteger("org.mortbay.io.nio.MONITOR_PERIOD",1000).intValue();
-    private static final int __MAX_SELECTS=Integer.getInteger("org.mortbay.io.nio.MAX_SELECTS",15000).intValue();
+    private static final int __MAX_SELECTS=Integer.getInteger("org.mortbay.io.nio.MAX_SELECTS",25000).intValue();
     private static final int __BUSY_PAUSE=Integer.getInteger("org.mortbay.io.nio.BUSY_PAUSE",50).intValue();
     private static final int __BUSY_KEY=Integer.getInteger("org.mortbay.io.nio.BUSY_KEY",-1).intValue();
     
@@ -503,16 +503,16 @@
                     if (now>_log)
                     {
                         if (_paused>0)  
-                            Log.info(this+" Busy selector - injecting delay "+_paused+" times");
+                            Log.debug(this+" Busy selector - injecting delay "+_paused+" times");
 
                         if (_jvmFix2>0)
-                            Log.info(this+" JVM BUG(s) - injecting delay"+_jvmFix2+" times");
+                            Log.debug(this+" JVM BUG(s) - injecting delay"+_jvmFix2+" times");
 
                         if (_jvmFix1>0)
-                            Log.info(this+" JVM BUG(s) - recreating selector "+_jvmFix1+" times, cancelled keys "+_jvmFix0+" times");
+                            Log.debug(this+" JVM BUG(s) - recreating selector "+_jvmFix1+" times, cancelled keys "+_jvmFix0+" times");
 
                         else if(Log.isDebugEnabled() && _jvmFix0>0)
-                            Log.info(this+" JVM BUG(s) - cancelled keys "+_jvmFix0+" times");
+                            Log.debug(this+" JVM BUG(s) - cancelled keys "+_jvmFix0+" times");
                         _paused=0;
                         _jvmFix2=0;
                         _jvmFix1=0;
