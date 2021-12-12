diff --git a/src/com/google/javascript/jscomp/Es6ToEs3Converter.java b/src/com/google/javascript/jscomp/Es6ToEs3Converter.java
index 6dfa7d8..f78f2bb 100644
--- a/src/com/google/javascript/jscomp/Es6ToEs3Converter.java
+++ b/src/com/google/javascript/jscomp/Es6ToEs3Converter.java
@@ -744,7 +744,7 @@
 
         JSTypeExpression existingType = membersToDeclare.get(member.getString());
         if (existingType != null && !existingType.equals(typeExpr)) {
-          compiler.report(JSError.make(member, CONFLICTING_GETTER_SETTER_TYPE));
+          compiler.report(JSError.make(member, CONFLICTING_GETTER_SETTER_TYPE, member.getString()));
         } else {
           membersToDeclare.put(member.getString(), typeExpr);
         }
