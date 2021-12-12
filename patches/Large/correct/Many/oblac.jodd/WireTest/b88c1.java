diff --git a/jodd-petite/src/test/java/jodd/petite/WireTest.java b/jodd-petite/src/test/java/jodd/petite/WireTest.java
index 0761b5d..b6858db 100644
--- a/jodd-petite/src/test/java/jodd/petite/WireTest.java
+++ b/jodd-petite/src/test/java/jodd/petite/WireTest.java
@@ -51,17 +51,18 @@
 		configurator.setIncludedEntries("jodd.petite.*");
 		configurator.setExcludedEntries("jodd.petite.data.*", "jodd.petite.tst3.*", "jodd.petite.tst.Ses");
 		configurator.setExcludedEntries(
-				"jodd.petite.data.*", "jodd.petite.tst3.*", "jodd.petite.tst.Ses", "*Public*", "*Secret*", "*$*");
+				"jodd.petite.data.*", "jodd.petite.tst3.*", "jodd.petite.tst.Ses", "*Public*", "*Secret*", "*$*",
+			"jodd.petite.prox.*");
 		configurator.configure(pc);
 
 		assertEquals(1, pc.getTotalBeans());
 		assertEquals(1, pc.getTotalScopes());
 		assertEquals(0, Foo.instanceCounter);
 
-		Foo foo = (Foo) pc.getBean("foo");
+		Foo foo = pc.getBean("foo");
 		assertNotNull(foo);
 		assertEquals(1, foo.hello());
-		foo = (Foo) pc.getBean("foo");
+		foo = pc.getBean("foo");
 		assertEquals(1, foo.hello());
 
 
@@ -82,7 +83,7 @@
 		Boo boo;
 		try {
 			//noinspection UnusedAssignment
-			boo = (Boo) pc.getBean("boo");
+			boo = pc.getBean("boo");
 			fail();
 		} catch (PetiteException pex) {
 			// zoo class is missing
@@ -99,7 +100,7 @@
 		assertEquals(4, pc.getTotalBeans());
 		assertEquals(2, pc.getTotalScopes());
 
-		boo = (Boo) pc.getBean("boo");
+		boo = pc.getBean("boo");
 		assertNotNull(boo);
 		assertNotNull(boo.getFoo());
 		assertNotNull(boo.zoo);
@@ -136,7 +137,7 @@
 		assertEquals(1, pc.getTotalScopes());
 		assertEquals(0, Foo.instanceCounter);
 
-		BooC boo = (BooC) pc.getBean("booC");
+		BooC boo = pc.getBean("booC");
 		assertNotNull(boo);
 		assertNotNull(boo.getFoo());
 		assertEquals(1, boo.getFoo().hello());
@@ -163,13 +164,13 @@
 
 		assertEquals(2, pc.getTotalBeans());
 
-		Goo goo = (Goo) pc.getBean("goo");
+		Goo goo = pc.getBean("goo");
 		assertNotNull(goo);
 		assertNotNull(goo.looCustom);
 		assertNull(goo.foo);
 
 		pc.registerPetiteBean(Foo.class, null, null, null, false);
-		goo = (Goo) pc.getBean("goo");
+		goo = pc.getBean("goo");
 		assertNotNull(goo);
 		assertNotNull(goo.looCustom);
 		assertNull(goo.foo);
@@ -180,7 +181,7 @@
 		pc.registerPetiteBean(Loo.class, null, null, null, false);
 		pc.registerPetiteBean(Foo.class, null, null, null, false);
 
-		goo = (Goo) pc.getBean("goo");
+		goo = pc.getBean("goo");
 		assertNotNull(goo);
 		assertNotNull(goo.looCustom);
 		assertNotNull(goo.foo);
@@ -195,7 +196,7 @@
 		pc.registerPetiteBean(DefaultIoo.class, "ioo", null, null, false);
 
 		assertEquals(2, pc.getTotalBeans());
-		Ioo ioo = (Ioo) pc.getBean("ioo");
+		Ioo ioo = pc.getBean("ioo");
 		assertNotNull(ioo);
 		assertNotNull(ioo.getFoo());
 		assertEquals(DefaultIoo.class, ioo.getClass());
@@ -208,7 +209,7 @@
 
 		assertEquals(1, pc.getTotalBeans());
 
-		PetiteContainer pc2 = (PetiteContainer) pc.getBean(PetiteContainer.PETITE_CONTAINER_REF_NAME);
+		PetiteContainer pc2 = pc.getBean(PetiteContainer.PETITE_CONTAINER_REF_NAME);
 		assertEquals(pc2, pc);
 
 	}
@@ -221,11 +222,11 @@
 		pc.registerPetiteBean(Boo.class, null, null, null, false);
 		pc.registerPetiteBean(Boo.class, "boo2", null, null, false);
 
-		Boo boo = (Boo) pc.getBean("boo");
+		Boo boo = pc.getBean("boo");
 		assertNotNull(boo.getFoo());
 		assertEquals(1, boo.getCount());
 
-		Boo boo2 = (Boo) pc.getBean("boo2");
+		Boo boo2 = pc.getBean("boo2");
 		assertNotSame(boo, boo2);
 		assertEquals(1, boo2.getCount());
 
