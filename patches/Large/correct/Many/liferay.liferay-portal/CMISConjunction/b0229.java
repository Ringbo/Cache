diff --git a/portal-service/src/com/liferay/portal/kernel/repository/cmis/search/CMISConjunction.java b/portal-service/src/com/liferay/portal/kernel/repository/cmis/search/CMISConjunction.java
index 501ab29..0039b20 100644
--- a/portal-service/src/com/liferay/portal/kernel/repository/cmis/search/CMISConjunction.java
+++ b/portal-service/src/com/liferay/portal/kernel/repository/cmis/search/CMISConjunction.java
@@ -32,10 +32,10 @@
 
 		List<CMISCriterion> cmisCriterions = list();
 
-		StringBundler sb = new StringBundler(cmisCriterions.size() * 2 - 1);
+		StringBundler sb = new StringBundler(cmisCriterions.size() * 2 + 1);
 
 		if (cmisCriterions.size() > 1) {
-			sb.append("(");
+			sb.append(StringPool.OPEN_PARENTHESIS);
 		}
 
 		for (int i = 0; i < cmisCriterions.size(); i++) {
@@ -49,7 +49,7 @@
 		}
 
 		if (cmisCriterions.size() > 1) {
-			sb.append(")");
+			sb.append(StringPool.CLOSE_PARENTHESIS);
 		}
 
 		return sb.toString();
