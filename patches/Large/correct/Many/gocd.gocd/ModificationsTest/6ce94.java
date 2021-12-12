diff --git a/common/test/unit/com/thoughtworks/go/domain/materials/ModificationsTest.java b/common/test/unit/com/thoughtworks/go/domain/materials/ModificationsTest.java
index d7f37e8..b332f10 100644
--- a/common/test/unit/com/thoughtworks/go/domain/materials/ModificationsTest.java
+++ b/common/test/unit/com/thoughtworks/go/domain/materials/ModificationsTest.java
@@ -277,7 +277,7 @@
         materialConfig.setFilter(filter);
         materialConfig.setInvertFilter(true);
 
-        Modifications modifications = new Modifications(multipleCheckin(aCheckIn("foo/bar.baz")));
+        Modifications modifications = new Modifications(multipleCheckin(aCheckIn("101", "foo/bar.baz")));
         assertThat(modifications.shouldBeIgnoredByFilterIn(materialConfig), is(false));
     }
 
