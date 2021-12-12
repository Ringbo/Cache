diff --git a/portal-service/src/com/liferay/portal/kernel/dao/search/TextSearchEntry.java b/portal-service/src/com/liferay/portal/kernel/dao/search/TextSearchEntry.java
index c5a1236..f45ac39 100644
--- a/portal-service/src/com/liferay/portal/kernel/dao/search/TextSearchEntry.java
+++ b/portal-service/src/com/liferay/portal/kernel/dao/search/TextSearchEntry.java
@@ -87,7 +87,7 @@
 				sb.append(_href);
 			}
 			else {
-				sb.append(HtmlUtil.escapeURL(_href));
+				sb.append(HtmlUtil.escape(_href));
 			}
 
 			sb.append("\"");
