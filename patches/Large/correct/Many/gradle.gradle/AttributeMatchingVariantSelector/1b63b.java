diff --git a/subprojects/dependency-management/src/main/java/org/gradle/api/internal/artifacts/transform/AttributeMatchingVariantSelector.java b/subprojects/dependency-management/src/main/java/org/gradle/api/internal/artifacts/transform/AttributeMatchingVariantSelector.java
index f166803..0868bbd 100644
--- a/subprojects/dependency-management/src/main/java/org/gradle/api/internal/artifacts/transform/AttributeMatchingVariantSelector.java
+++ b/subprojects/dependency-management/src/main/java/org/gradle/api/internal/artifacts/transform/AttributeMatchingVariantSelector.java
@@ -165,7 +165,7 @@
                                                                                                           Pair<ResolvedVariant, ConsumerVariantMatchResult.ConsumerVariant> firstCandidate,
                                                                                                           Pair<ResolvedVariant, ConsumerVariantMatchResult.ConsumerVariant> secondCandidate) {
 
-        if (matcher.isMatching(firstCandidate.right.attributes, secondCandidate.right.attributes)) {
+        if (matcher.isMatching(firstCandidate.right.attributes, secondCandidate.right.attributes) || matcher.isMatching(secondCandidate.right.attributes, firstCandidate.right.attributes)) {
             if (firstCandidate.right.depth >= secondCandidate.right.depth) {
                 return Optional.of(secondCandidate);
             } else {
