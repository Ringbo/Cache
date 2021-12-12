diff --git a/pinot-common/src/main/java/com/linkedin/pinot/common/utils/DataTable.java b/pinot-common/src/main/java/com/linkedin/pinot/common/utils/DataTable.java
index 5d5f36a..71a85d2 100644
--- a/pinot-common/src/main/java/com/linkedin/pinot/common/utils/DataTable.java
+++ b/pinot-common/src/main/java/com/linkedin/pinot/common/utils/DataTable.java
@@ -364,7 +364,7 @@
         int valueLength = in.readInt();
         byte[] valueBytes = new byte[valueLength];
         in.read(valueBytes);
-        map.put(new String(keyBytes), new String(valueBytes));
+        map.put(new String(keyBytes, UTF8), new String(valueBytes, UTF8));
       }
     } catch (Exception e) {
       LOGGER.error("Exception while deserializing dictionary", e);
@@ -407,14 +407,14 @@
         temp = new byte[readLength];
         in.read(temp);
         Map<Integer, String> childMap = new HashMap<Integer, String>();
-        map.put(new String(temp), childMap);
+        map.put(new String(temp, UTF8), childMap);
         int childMapSize = in.readInt();
         for (int j = 0; j < childMapSize; j++) {
           Integer key = in.readInt();
           int valueLength = in.readInt();
           temp = new byte[valueLength];
           in.read(temp);
-          childMap.put(key, new String(temp));
+          childMap.put(key, new String(temp, UTF8));
         }
       }
     } catch (Exception e) {
