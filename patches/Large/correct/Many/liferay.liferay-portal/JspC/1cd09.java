diff --git a/modules/util/jasper-jspc/src/main/java/com/liferay/jasper/jspc/JspC.java b/modules/util/jasper-jspc/src/main/java/com/liferay/jasper/jspc/JspC.java
index c8223f2..74a0416 100644
--- a/modules/util/jasper-jspc/src/main/java/com/liferay/jasper/jspc/JspC.java
+++ b/modules/util/jasper-jspc/src/main/java/com/liferay/jasper/jspc/JspC.java
@@ -76,7 +76,7 @@
 				}
 			}
 			catch (Exception e2) {
-				e2.addSuppressed(e);
+				e2.addSuppressed(e1);
 
 				throw new RuntimeException(e2);
 			}
