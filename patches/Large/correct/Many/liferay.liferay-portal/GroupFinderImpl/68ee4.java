diff --git a/portal-impl/src/com/liferay/portal/service/persistence/impl/GroupFinderImpl.java b/portal-impl/src/com/liferay/portal/service/persistence/impl/GroupFinderImpl.java
index b92ac59..cf2c391 100644
--- a/portal-impl/src/com/liferay/portal/service/persistence/impl/GroupFinderImpl.java
+++ b/portal-impl/src/com/liferay/portal/service/persistence/impl/GroupFinderImpl.java
@@ -882,7 +882,7 @@
 	}
 
 	protected int countByGroupId(
-			Session session, long groupId, LinkedHashMap<String, Object> params)
+			Session session, long groupId, Map<String, Object> params)
 		throws Exception {
 
 		String sql = CustomSQLUtil.get(COUNT_BY_GROUP_ID);
@@ -915,7 +915,7 @@
 	protected List<Long> countByC_PG_N_D(
 			Session session, long companyId, long parentGroupId,
 			String parentGroupIdComparator, String[] names,
-			String[] descriptions, LinkedHashMap<String, Object> params,
+			String[] descriptions, Map<String, Object> params,
 			boolean andOperator)
 		throws Exception {
 
@@ -950,7 +950,7 @@
 		return q.list(true);
 	}
 
-	protected String getJoin(LinkedHashMap<String, Object> params) {
+	protected String getJoin(Map<String, Object> params) {
 		if ((params == null) || params.isEmpty()) {
 			return StringPool.BLANK;
 		}
@@ -990,7 +990,7 @@
 		return sb.toString();
 	}
 
-	protected String getWhere(LinkedHashMap<String, Object> params) {
+	protected String getWhere(Map<String, Object> params) {
 		if ((params == null) || params.isEmpty()) {
 			return StringPool.BLANK;
 		}
@@ -1097,7 +1097,7 @@
 	}
 
 	protected String replaceJoinAndWhere(
-		String sql, LinkedHashMap<String, Object> params) {
+		String sql, Map<String, Object> params) {
 
 		if (params.isEmpty()) {
 			return StringUtil.removeSubstrings(sql, "[$JOIN$]", "[$WHERE$]");
@@ -1130,7 +1130,7 @@
 		return sql;
 	}
 
-	protected void setJoin(QueryPos qPos, LinkedHashMap<String, Object> params)
+	protected void setJoin(QueryPos qPos, Map<String, Object> params)
 		throws Exception {
 
 		if (params == null) {
@@ -1258,18 +1258,18 @@
 
 	@SafeVarargs
 	private final String _buildSQLCacheKey(
-		OrderByComparator<Group> obc, LinkedHashMap<String, Object>... params) {
+		OrderByComparator<Group> obc, Map<String, Object>... params) {
 
 		return _buildSQLCacheKey(obc.getOrderBy(), params);
 	}
 
 	@SafeVarargs
 	private final String _buildSQLCacheKey(
-		String sql, LinkedHashMap<String, Object>... params) {
+		String sql, Map<String, Object>... params) {
 
 		int size = 1;
 
-		for (LinkedHashMap<String, Object> param : params) {
+		for (Map<String, Object> param : params) {
 			if (param != null) {
 				size += param.size() * 4;
 			}
@@ -1279,7 +1279,7 @@
 
 		sb.append(sql);
 
-		for (LinkedHashMap<String, Object> param : params) {
+		for (Map<String, Object> param : params) {
 			if (param != null) {
 				for (Map.Entry<String, Object> entry : param.entrySet()) {
 					sb.append(StringPool.COMMA);
@@ -1489,10 +1489,9 @@
 	}
 
 	private void _populateUnionParams(
-		long userId, long[] classNameIds, LinkedHashMap<String, Object> params1,
-		LinkedHashMap<String, Object> params2,
-		LinkedHashMap<String, Object> params3,
-		LinkedHashMap<String, Object> params4) {
+		long userId, long[] classNameIds, Map<String, Object> params1,
+		Map<String, Object> params2, Map<String, Object> params3,
+		Map<String, Object> params4) {
 
 		params2.remove("usersGroups");
 		params2.put("groupOrg", userId);
