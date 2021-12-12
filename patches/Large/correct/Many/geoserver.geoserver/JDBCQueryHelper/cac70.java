diff --git a/src/community/jdbcstore/src/main/java/org/geoserver/jdbcstore/internal/JDBCQueryHelper.java b/src/community/jdbcstore/src/main/java/org/geoserver/jdbcstore/internal/JDBCQueryHelper.java
index 08e94d7..ca9002a 100644
--- a/src/community/jdbcstore/src/main/java/org/geoserver/jdbcstore/internal/JDBCQueryHelper.java
+++ b/src/community/jdbcstore/src/main/java/org/geoserver/jdbcstore/internal/JDBCQueryHelper.java
@@ -412,7 +412,7 @@
             try (PreparedStatement stmt = query.toStatement(c)) {
                 try (ResultSet rs = stmt.executeQuery()) {
                     if (rs.next()) {
-                        assert (rs.last());
+                        assert (rs.isLast());
                         Map<String, Object> result = new HashMap<String, Object>();
                         for (int i = 0; i < fields.length; i++) {
                             result.put(fields[i].getFieldName(), fields[i].getValue(rs));
@@ -481,7 +481,7 @@
             try (PreparedStatement stmt = query.toStatement(c)){
                 try (ResultSet rs = stmt.executeQuery()) {
                     if(rs.next()) {                
-                        assert(rs.last());                   
+                        assert(rs.isLast());
                         InputStream is = field.getValue(rs);
                         return is == null ? null : new ClosingInputStreamWrapper(is, c);
                     } else {
