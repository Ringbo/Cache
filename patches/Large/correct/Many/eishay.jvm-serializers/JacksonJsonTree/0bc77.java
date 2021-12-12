diff --git a/tpc/src/serializers/jackson/JacksonJsonTree.java b/tpc/src/serializers/jackson/JacksonJsonTree.java
index 63c02e2..7675b2d 100644
--- a/tpc/src/serializers/jackson/JacksonJsonTree.java
+++ b/tpc/src/serializers/jackson/JacksonJsonTree.java
@@ -173,7 +173,7 @@
       for (String person : media.persons) {
         persons.add(person);
       }
-      node.put("persons", persons);
+      node.set("persons", persons);
       node.put("player", media.player.name());
       node.put("size", media.size);
       node.put("title", media.title);
