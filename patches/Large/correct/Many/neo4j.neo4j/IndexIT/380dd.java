diff --git a/community/kernel/src/test/java/org/neo4j/kernel/impl/api/index/IndexIT.java b/community/kernel/src/test/java/org/neo4j/kernel/impl/api/index/IndexIT.java
index c18493b..c8566a9 100644
--- a/community/kernel/src/test/java/org/neo4j/kernel/impl/api/index/IndexIT.java
+++ b/community/kernel/src/test/java/org/neo4j/kernel/impl/api/index/IndexIT.java
@@ -133,8 +133,7 @@
     {
         // given
         PropertyAccessor propertyAccessor = mock( PropertyAccessor.class );
-        ConstraintIndexCreator creator = new ConstraintIndexCreator( () -> kernel, indexingService, propertyAccessor,
-                false );
+        ConstraintIndexCreator creator = new ConstraintIndexCreator( () -> kernel, indexingService, propertyAccessor );
 
         IndexDescriptor constraintIndex = creator.createConstraintIndex( descriptor );
         // then
