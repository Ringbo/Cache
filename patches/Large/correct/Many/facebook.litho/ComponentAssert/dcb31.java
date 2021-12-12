diff --git a/litho-testing/src/main/java/com/facebook/litho/testing/assertj/ComponentAssert.java b/litho-testing/src/main/java/com/facebook/litho/testing/assertj/ComponentAssert.java
index 9711b21..dec1ac1 100644
--- a/litho-testing/src/main/java/com/facebook/litho/testing/assertj/ComponentAssert.java
+++ b/litho-testing/src/main/java/com/facebook/litho/testing/assertj/ComponentAssert.java
@@ -193,7 +193,7 @@
         actual);
 
     Java6Assertions.assertThat(mountedSubComponents)
-        .isEqualTo(subComponents);
+        .containsExactly(subComponents);
 
     return this;
   }
