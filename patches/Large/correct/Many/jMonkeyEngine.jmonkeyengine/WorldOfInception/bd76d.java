diff --git a/engine/src/test/jme3test/games/WorldOfInception.java b/engine/src/test/jme3test/games/WorldOfInception.java
index ab8c218..10aeb87 100644
--- a/engine/src/test/jme3test/games/WorldOfInception.java
+++ b/engine/src/test/jme3test/games/WorldOfInception.java
@@ -465,7 +465,7 @@
             strb.insert(0, this.getPlayerPosition());
             cur = cur.getParent();
             while (cur != null) {
-                strb.insert(0, this.getPositionInParent() + " / ");
+                strb.insert(0, cur.getPositionInParent() + " / ");
                 cur = cur.getParent();
             }
             return strb.toString();
