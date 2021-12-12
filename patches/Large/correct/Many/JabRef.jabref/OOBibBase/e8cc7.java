diff --git a/src/main/java/net/sf/jabref/gui/openoffice/OOBibBase.java b/src/main/java/net/sf/jabref/gui/openoffice/OOBibBase.java
index fc0c8a5..019a4a5 100644
--- a/src/main/java/net/sf/jabref/gui/openoffice/OOBibBase.java
+++ b/src/main/java/net/sf/jabref/gui/openoffice/OOBibBase.java
@@ -523,7 +523,7 @@
                             } else {
                                 num.add(j, lastNum + 1);
                                 if (numbers.containsKey(keys[j])) {
-                                    num.add(j, numbers.get(keys[j]));
+                                    num.set(j, numbers.get(keys[j]));
                                 } else {
                                     numbers.put(keys[j], num.get(j));
                                     lastNum = num.get(j);
