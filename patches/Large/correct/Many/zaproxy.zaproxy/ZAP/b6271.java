diff --git a/src/org/zaproxy/zap/ZAP.java b/src/org/zaproxy/zap/ZAP.java
index c3f38bd..d8420b0 100644
--- a/src/org/zaproxy/zap/ZAP.java
+++ b/src/org/zaproxy/zap/ZAP.java
@@ -84,7 +84,7 @@
 	    try {
 	        zap.run();
 	    } catch (final Exception e) {
-	        log.fatal(e.getStackTrace());
+	        log.fatal(e.getMessage(), e);
 	        //throw e;
 	        System.exit(1);
 	    }
@@ -308,7 +308,7 @@
 	        }
 		    rc = 0;
 	    } catch (final Exception e) {
-	        log.error(e.getMessage());
+	        log.error(e.getMessage(), e);
 	        System.out.println(e.getMessage());
 	        rc = 1;
 	    } finally {
