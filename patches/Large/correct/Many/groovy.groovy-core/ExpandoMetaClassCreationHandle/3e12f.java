diff --git a/src/main/groovy/lang/ExpandoMetaClassCreationHandle.java b/src/main/groovy/lang/ExpandoMetaClassCreationHandle.java
index 5fd8ef7..cf7528d 100644
--- a/src/main/groovy/lang/ExpandoMetaClassCreationHandle.java
+++ b/src/main/groovy/lang/ExpandoMetaClassCreationHandle.java
@@ -46,7 +46,7 @@
 			return new ExpandoMetaClass(theClass, true, true);
 		}
 		else {
-			return super.create(theClass, registry);
+			return super.createNormalMetaClass(theClass, registry);
 		}
 	}
 
