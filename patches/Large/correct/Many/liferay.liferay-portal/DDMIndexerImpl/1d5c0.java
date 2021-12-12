diff --git a/portal-impl/src/com/liferay/portlet/dynamicdatamapping/util/DDMIndexerImpl.java b/portal-impl/src/com/liferay/portlet/dynamicdatamapping/util/DDMIndexerImpl.java
index f019fb1..beb6f2a 100644
--- a/portal-impl/src/com/liferay/portlet/dynamicdatamapping/util/DDMIndexerImpl.java
+++ b/portal-impl/src/com/liferay/portlet/dynamicdatamapping/util/DDMIndexerImpl.java
@@ -59,7 +59,7 @@
 			else {
 				String valueString = String.valueOf(value);
 
-				document.addKeyword(name, valueString);
+				document.addText(name, valueString);
 			}
 		}
 	}
