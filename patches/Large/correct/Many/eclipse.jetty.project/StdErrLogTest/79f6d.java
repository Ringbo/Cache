diff --git a/jetty-util/src/test/java/org/eclipse/jetty/util/log/StdErrLogTest.java b/jetty-util/src/test/java/org/eclipse/jetty/util/log/StdErrLogTest.java
index f54df1e..2a0ffcf 100644
--- a/jetty-util/src/test/java/org/eclipse/jetty/util/log/StdErrLogTest.java
+++ b/jetty-util/src/test/java/org/eclipse/jetty/util/log/StdErrLogTest.java
@@ -39,7 +39,7 @@
             log.debug(null,"- Testing","debug(null,arg0,arg1)");
             log.debug(null,null,null);
             
-            log.debug("Testing debug(msg,null)",null);
+            log.debug("Testing debug(msg,null)");
             log.debug(null,new Throwable("IGNORE::Testing debug(null,thrw)").fillInStackTrace());
             
             log.warn("Testing warn(msg,null,null) - {} {}",null,null);
@@ -48,7 +48,7 @@
             log.warn(null,"- Testing","warn(msg,arg0,arg1)");
             log.warn(null,null,null);
                        
-            log.warn("Testing warn(msg,null)",null);
+            log.warn("Testing warn(msg,null)");
             log.warn(null,new Throwable("IGNORE::Testing warn(msg,thrw)").fillInStackTrace());
         }
         catch (NullPointerException npe)
