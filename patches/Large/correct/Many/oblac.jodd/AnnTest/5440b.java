diff --git a/jodd-proxetta/src/test/java/jodd/proxetta/AnnTest.java b/jodd-proxetta/src/test/java/jodd/proxetta/AnnTest.java
index 4303e4e..daec5b8 100644
--- a/jodd-proxetta/src/test/java/jodd/proxetta/AnnTest.java
+++ b/jodd-proxetta/src/test/java/jodd/proxetta/AnnTest.java
@@ -116,7 +116,7 @@
 		Object hero = proxettaBuilder.newInstance();
 
 		Method nameMethod = hero.getClass().getMethod("name");
-		assertEquals("BatmanHero37W88.3CatWoman99speeeeedXRAYnull", nameMethod.invoke(nameMethod));
+		assertEquals("BatmanHero37W88.3CatWoman99speeeeedXRAYnull", nameMethod.invoke(hero));
 	}
 
 	@Test
