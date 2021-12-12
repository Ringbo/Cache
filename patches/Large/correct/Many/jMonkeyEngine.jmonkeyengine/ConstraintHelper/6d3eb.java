diff --git a/engine/src/blender/com/jme3/scene/plugins/blender/constraints/ConstraintHelper.java b/engine/src/blender/com/jme3/scene/plugins/blender/constraints/ConstraintHelper.java
index 0b496ed..b973756 100644
--- a/engine/src/blender/com/jme3/scene/plugins/blender/constraints/ConstraintHelper.java
+++ b/engine/src/blender/com/jme3/scene/plugins/blender/constraints/ConstraintHelper.java
@@ -44,7 +44,7 @@
 	 * @throws BlenderFileException
 	 */
 	public Map<Long, List<Constraint>> loadConstraints(Structure objectStructure, DataRepository dataRepository) throws BlenderFileException {
-		if (blenderVersion < 250) {//TODO
+		if (blenderVersion >= 250) {//TODO
 			LOGGER.warning("Loading of constraints not yet implemented for version 2.5x !");
 			return new HashMap<Long, List<Constraint>>(0);
 		}
