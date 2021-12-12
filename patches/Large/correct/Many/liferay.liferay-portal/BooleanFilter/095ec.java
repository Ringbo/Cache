diff --git a/portal-kernel/src/com/liferay/portal/kernel/search/filter/BooleanFilter.java b/portal-kernel/src/com/liferay/portal/kernel/search/filter/BooleanFilter.java
index a3c14f2..0cba1dc 100644
--- a/portal-kernel/src/com/liferay/portal/kernel/search/filter/BooleanFilter.java
+++ b/portal-kernel/src/com/liferay/portal/kernel/search/filter/BooleanFilter.java
@@ -252,7 +252,7 @@
 
 		StringBundler sb = new StringBundler(2 * booleanClauses.size());
 
-		for (BooleanClause<Filter> booleanClause : _mustBooleanClauses) {
+		for (BooleanClause<Filter> booleanClause : booleanClauses) {
 			sb.append(booleanClause);
 
 			sb.append(StringPool.COMMA_AND_SPACE);
