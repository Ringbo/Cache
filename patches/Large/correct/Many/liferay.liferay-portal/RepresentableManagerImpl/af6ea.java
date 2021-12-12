diff --git a/modules/apps/foundation/apio-architect/apio-architect-wiring-osgi-impl/src/main/java/com/liferay/apio/architect/wiring/osgi/internal/manager/representable/RepresentableManagerImpl.java b/modules/apps/foundation/apio-architect/apio-architect-wiring-osgi-impl/src/main/java/com/liferay/apio/architect/wiring/osgi/internal/manager/representable/RepresentableManagerImpl.java
index 9876f6b..dbf1225 100644
--- a/modules/apps/foundation/apio-architect/apio-architect-wiring-osgi-impl/src/main/java/com/liferay/apio/architect/wiring/osgi/internal/manager/representable/RepresentableManagerImpl.java
+++ b/modules/apps/foundation/apio-architect/apio-architect-wiring-osgi-impl/src/main/java/com/liferay/apio/architect/wiring/osgi/internal/manager/representable/RepresentableManagerImpl.java
@@ -117,15 +117,15 @@
 					Map::entrySet
 				).map(
 					Collection::stream
-				).flatMap(
-					stream -> stream.filter(
+				).orElseGet(
+					Stream::empty
+				).filter(
 						entry -> Objects.equals(entry.getValue(), name)
 					).map(
 						Entry::getKey
-					).findFirst()
-				);
+				).findFirst();
 
-				if (optional.isPresent()) {
+				if (classNameOptional.isPresent()) {
 					_apioLogger.warning(
 						_getDuplicateErrorMessage(
 							clazz, name, classNameOptional.get()));
