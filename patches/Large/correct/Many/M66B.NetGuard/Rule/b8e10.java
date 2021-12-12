diff --git a/app/src/main/java/eu/faircode/netguard/Rule.java b/app/src/main/java/eu/faircode/netguard/Rule.java
index 3ea0435..358f437 100644
--- a/app/src/main/java/eu/faircode/netguard/Rule.java
+++ b/app/src/main/java/eu/faircode/netguard/Rule.java
@@ -85,7 +85,7 @@
                     pre_blocked.put(pkg, pblocked);
                     pre_unused.put(pkg, punused);
                     pre_roaming.put(pkg, proaming);
-                    Log.i(tag, "Predefined " + pkg + " blocked=" + pblocked + " unused=" + unused + " roaming=" + proaming);
+                    Log.i(tag, "Predefined " + pkg + " blocked=" + pblocked + " unused=" + punused + " roaming=" + proaming);
                 }
                 eventType = xml.next();
             }
