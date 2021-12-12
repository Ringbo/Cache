diff --git a/core/src/test/java/org/springframework/security/core/parameters/DefaultSecurityParameterNameDiscovererTests.java b/core/src/test/java/org/springframework/security/core/parameters/DefaultSecurityParameterNameDiscovererTests.java
index 3befef4..52f171f 100644
--- a/core/src/test/java/org/springframework/security/core/parameters/DefaultSecurityParameterNameDiscovererTests.java
+++ b/core/src/test/java/org/springframework/security/core/parameters/DefaultSecurityParameterNameDiscovererTests.java
@@ -123,6 +123,6 @@
         Set<String> annotationsToUse = (Set<String>)ReflectionTestUtils.getField(annotationDisc, "annotationClassesToUse");
         assertThat(annotationsToUse).containsOnly(P.class.getName());
 
-        assertThat(discoverers.get(1).getClass().getName()).isEqualTo("org.springframework.core.DefaultParameterNameDiscoverer");
+        assertThat(discoverers.get(2).getClass().getName()).isEqualTo("org.springframework.core.DefaultParameterNameDiscoverer");
     }
 }
\ No newline at end of file
