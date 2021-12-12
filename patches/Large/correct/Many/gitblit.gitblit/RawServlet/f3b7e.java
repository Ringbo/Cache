diff --git a/src/main/java/com/gitblit/servlet/RawServlet.java b/src/main/java/com/gitblit/servlet/RawServlet.java
index 09f9f8a..1d2724b 100644
--- a/src/main/java/com/gitblit/servlet/RawServlet.java
+++ b/src/main/java/com/gitblit/servlet/RawServlet.java
@@ -468,7 +468,7 @@
 				served = true;
 			}
 		} finally {
-			tw.release();
+			tw.close();
 			rw.dispose();
 		}
 
