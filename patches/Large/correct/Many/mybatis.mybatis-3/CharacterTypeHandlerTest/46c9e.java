diff --git a/src/test/java/org/apache/ibatis/type/CharacterTypeHandlerTest.java b/src/test/java/org/apache/ibatis/type/CharacterTypeHandlerTest.java
index 7e09ebf..f452012 100644
--- a/src/test/java/org/apache/ibatis/type/CharacterTypeHandlerTest.java
+++ b/src/test/java/org/apache/ibatis/type/CharacterTypeHandlerTest.java
@@ -67,7 +67,7 @@
   @Test
   public void shouldGetResultNullFromResultSetByPosition() throws Exception {
     when(rs.getString(1)).thenReturn(null);
-    when(rs.wasNull()).thenReturn(false);
+    when(rs.wasNull()).thenReturn(true);
     assertNull(TYPE_HANDLER.getResult(rs, 1));
   }
 
