diff --git a/src/main/java/com/puppycrawl/tools/checkstyle/checks/coding/IllegalTypeCheck.java b/src/main/java/com/puppycrawl/tools/checkstyle/checks/coding/IllegalTypeCheck.java
index bfc5d55..282c562 100644
--- a/src/main/java/com/puppycrawl/tools/checkstyle/checks/coding/IllegalTypeCheck.java
+++ b/src/main/java/com/puppycrawl/tools/checkstyle/checks/coding/IllegalTypeCheck.java
@@ -464,9 +464,9 @@
      */
     public void setMemberModifiers(String modifiers)
     {
-        final List<Integer> modifiersList = new ArrayList<>(modifiers.length());
+        final List<Integer> modifiersList = new ArrayList<>();
         for (String modifier : modifiers.split(", ")) {
-            modifiersList.add(TokenTypes.getTokenId(modifier));
+            modifiersList.add(TokenTypes.getTokenId(modifier.trim()));
         }
         this.memberModifiers = modifiersList;
     }
