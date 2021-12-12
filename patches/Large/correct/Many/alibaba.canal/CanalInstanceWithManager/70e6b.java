diff --git a/instance/manager/src/main/java/com/alibaba/otter/canal/instance/manager/CanalInstanceWithManager.java b/instance/manager/src/main/java/com/alibaba/otter/canal/instance/manager/CanalInstanceWithManager.java
index 5319616..bca5ba1 100644
--- a/instance/manager/src/main/java/com/alibaba/otter/canal/instance/manager/CanalInstanceWithManager.java
+++ b/instance/manager/src/main/java/com/alibaba/otter/canal/instance/manager/CanalInstanceWithManager.java
@@ -263,7 +263,7 @@
                 mysqlEventParser.setMasterPosition(masterPosition);
 
                 if (parameters.getPositions().size() > 1) {
-                    EntryPosition standbyPosition = JsonUtils.unmarshalFromString(parameters.getPositions().get(0),
+                    EntryPosition standbyPosition = JsonUtils.unmarshalFromString(parameters.getPositions().get(1),
                         EntryPosition.class);
                     mysqlEventParser.setStandbyPosition(standbyPosition);
                 }
