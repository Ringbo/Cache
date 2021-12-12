diff --git a/portal-impl/src/com/liferay/portal/tools/servicebuilder/ServiceBuilder.java b/portal-impl/src/com/liferay/portal/tools/servicebuilder/ServiceBuilder.java
index 3430652..9d5ace4 100644
--- a/portal-impl/src/com/liferay/portal/tools/servicebuilder/ServiceBuilder.java
+++ b/portal-impl/src/com/liferay/portal/tools/servicebuilder/ServiceBuilder.java
@@ -4800,7 +4800,7 @@
 						ListUtil.toString(_ejbList, Entity.NAME_ACCESSOR));
 			}
 
-			entity.addReference(entity);
+			entity.addReference(referenceEntity);
 		}
 
 		entity.setResolved();
