diff --git a/builder/src/main/java/com/iluwatar/Hero.java b/builder/src/main/java/com/iluwatar/Hero.java
index c87cfdf..47e5d75 100644
--- a/builder/src/main/java/com/iluwatar/Hero.java
+++ b/builder/src/main/java/com/iluwatar/Hero.java
@@ -94,7 +94,7 @@
 
 		public HeroBuilder(Profession profession, String name) {
 			if (profession == null || name == null) {
-				throw new NullPointerException(
+				throw new IllegalArgumentException(
 						"profession and name can not be null");
 			}
 			this.profession = profession;
