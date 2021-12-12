diff --git a/api/src/test/java/org/openmrs/validator/ConceptValidatorTest.java b/api/src/test/java/org/openmrs/validator/ConceptValidatorTest.java
index d5eb318..204add3 100644
--- a/api/src/test/java/org/openmrs/validator/ConceptValidatorTest.java
+++ b/api/src/test/java/org/openmrs/validator/ConceptValidatorTest.java
@@ -116,7 +116,7 @@
 		ConceptName anotherConceptName = ConceptNameTest.createMockConceptName(3, Context.getLocale(), null, true);
 		anotherConceptName.setName(duplicateName);
 		newConcept.addName(anotherConceptName);
-		Errors errors = new BindException(concept, "concept");
+		Errors errors = new BindException(newConcept, "concept");
 		new ConceptValidator().validate(newConcept, errors);
 	}
 	
@@ -128,7 +128,7 @@
 	@Test(expected = DuplicateConceptNameException.class)
 	@Verifies(value = "should fail if there is a duplicate unretired preferred name in the same locale", method = "validate(Object,Errors)")
 	public void validate_shouldFailIfThereIsADuplicateUnretiredPreferredNameInTheSameLocale() throws Exception {
-		Context.setLocale(Context.getLocale());
+		Context.setLocale(new Locale("en"));
 		Concept concept = Context.getConceptService().getConcept(5497);
 		ConceptName preferredName = new ConceptName("preferred name", Context.getLocale());
 		concept.setPreferredName(preferredName);
@@ -139,7 +139,7 @@
 		ConceptName anotherConceptName = ConceptNameTest.createMockConceptName(3, Context.getLocale(), null, true);
 		anotherConceptName.setName("preferred name");
 		newConcept.addName(anotherConceptName);
-		Errors errors = new BindException(concept, "concept");
+		Errors errors = new BindException(newConcept, "concept");
 		new ConceptValidator().validate(newConcept, errors);
 	}
 	
@@ -177,7 +177,7 @@
 	@Test
 	@Verifies(value = "should pass if the duplicate ConceptName is neither preferred nor fully Specified", method = "validate(Object,Errors)")
 	public void validate_shouldPassIfTheDuplicateConceptNameIsNeitherPreferredNorFullySpecified() throws Exception {
-		Context.setLocale(Context.getLocale());
+		Context.setLocale(new Locale("en"));
 		Concept concept = Context.getConceptService().getConcept(5497);
 		ConceptName duplicateName = new ConceptName("duplicate name", Context.getLocale());
 		//note that the name is neither fully specified nor preferred,
@@ -191,7 +191,7 @@
 		ConceptName assumedDuplicateName = ConceptNameTest.createMockConceptName(3, Context.getLocale(), null, true);
 		assumedDuplicateName.setName(duplicateName.getName());
 		newConcept.addName(assumedDuplicateName);
-		Errors errors = new BindException(concept, "concept");
+		Errors errors = new BindException(newConcept, "concept");
 		new ConceptValidator().validate(newConcept, errors);
 		Assert.assertEquals(false, errors.hasErrors());
 	}
@@ -212,7 +212,7 @@
 		ConceptName anotherConceptName = ConceptNameTest.createMockConceptName(3, Context.getLocale(), null, true);
 		anotherConceptName.setName(duplicateName);
 		newConcept.addName(anotherConceptName);
-		Errors errors = new BindException(concept, "concept");
+		Errors errors = new BindException(newConcept, "concept");
 		new ConceptValidator().validate(newConcept, errors);
 		Assert.assertEquals(false, errors.hasErrors());
 	}
