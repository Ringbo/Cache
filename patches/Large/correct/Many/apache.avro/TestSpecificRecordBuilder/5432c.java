diff --git a/lang/java/ipc/src/test/java/org/apache/avro/specific/TestSpecificRecordBuilder.java b/lang/java/ipc/src/test/java/org/apache/avro/specific/TestSpecificRecordBuilder.java
index 4fa6fe0..4d19b7e 100644
--- a/lang/java/ipc/src/test/java/org/apache/avro/specific/TestSpecificRecordBuilder.java
+++ b/lang/java/ipc/src/test/java/org/apache/avro/specific/TestSpecificRecordBuilder.java
@@ -47,7 +47,7 @@
     Assert.assertTrue(builder.hasName());
     Assert.assertEquals("James Gosling", builder.getName());
     Assert.assertTrue(builder.hasYearOfBirth());
-    Assert.assertEquals(new Integer(1955), builder.getYearOfBirth());
+    Assert.assertEquals(1955, builder.getYearOfBirth());
     Assert.assertFalse(builder.hasCountry());
     Assert.assertNull(builder.getCountry());
     Assert.assertTrue(builder.hasState());
@@ -59,7 +59,7 @@
 
     Person person = builder.build();
     Assert.assertEquals("James Gosling", person.getName());
-    Assert.assertEquals(new Integer(1955), person.getYearOfBirth());
+    Assert.assertEquals(1955, person.getYearOfBirth());
     Assert.assertEquals("US", person.getCountry());  // country should default to "US"
     Assert.assertEquals("CA", person.getState());
     Assert.assertNotNull(person.getFriends());  // friends should default to an empty list
@@ -75,7 +75,7 @@
 
     Person.Builder builderCopy = Person.newBuilder(person);
     Assert.assertEquals("James Gosling", builderCopy.getName());
-    Assert.assertEquals(new Integer(1955), builderCopy.getYearOfBirth());
+    Assert.assertEquals(1955, builderCopy.getYearOfBirth());
     Assert.assertEquals("US", builderCopy.getCountry());  // country should default to "US"
     Assert.assertEquals("CA", builderCopy.getState());
     Assert.assertNotNull(builderCopy.getFriends());  // friends should default to an empty list
@@ -102,13 +102,13 @@
           .setProduct(product)
           .build())
       .build();
-    Assert.assertEquals(datetime, p.getDatetime().longValue());
+    Assert.assertEquals(datetime, p.getDatetime());
     Assert.assertEquals(ProductPage.class, p.getPageContext().getClass());
     Assert.assertEquals(product, ((ProductPage)p.getPageContext()).getProduct());
 
     PageView p2 = PageView.newBuilder(p).build();
 
-    Assert.assertEquals(datetime, p2.getDatetime().longValue());
+    Assert.assertEquals(datetime, p2.getDatetime());
     Assert.assertEquals(ProductPage.class, p2.getPageContext().getClass());
     Assert.assertEquals(product, ((ProductPage)p2.getPageContext()).getProduct());
 
@@ -141,10 +141,10 @@
     Assert.assertEquals(interop.getArrayField(), copy.getArrayField());
     Assert.assertEquals(interop.getBoolField(), copy.getBoolField());
     Assert.assertEquals(interop.getBytesField(), copy.getBytesField());
-    Assert.assertEquals(interop.getDoubleField(), copy.getDoubleField());
+    Assert.assertEquals(interop.getDoubleField(), copy.getDoubleField(), 0.001);
     Assert.assertEquals(interop.getEnumField(), copy.getEnumField());
     Assert.assertEquals(interop.getFixedField(), copy.getFixedField());
-    Assert.assertEquals(interop.getFloatField(), copy.getFloatField());
+    Assert.assertEquals(interop.getFloatField(), copy.getFloatField(), 0.001);
     Assert.assertEquals(interop.getIntField(), copy.getIntField());
     Assert.assertEquals(interop.getLongField(), copy.getLongField());
     Assert.assertEquals(interop.getMapField(), copy.getMapField());
