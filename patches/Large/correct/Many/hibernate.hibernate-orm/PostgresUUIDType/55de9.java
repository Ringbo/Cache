diff --git a/core/src/main/java/org/hibernate/type/PostgresUUIDType.java b/core/src/main/java/org/hibernate/type/PostgresUUIDType.java
index 3ec3678..3444fa4 100644
--- a/core/src/main/java/org/hibernate/type/PostgresUUIDType.java
+++ b/core/src/main/java/org/hibernate/type/PostgresUUIDType.java
@@ -68,7 +68,7 @@
 			return new BasicBinder<X>( javaTypeDescriptor, this ) {
 				@Override
 				protected void doBind(PreparedStatement st, X value, int index, WrapperOptions options) throws SQLException {
-					st.setObject( index, javaTypeDescriptor.unwrap( value, UUID.class, options ) );
+					st.setObject( index, javaTypeDescriptor.unwrap( value, UUID.class, options ), getSqlType() );
 				}
 			};
 		}
