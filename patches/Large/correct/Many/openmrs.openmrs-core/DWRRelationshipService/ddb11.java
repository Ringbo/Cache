diff --git a/src/web/org/openmrs/web/dwr/DWRRelationshipService.java b/src/web/org/openmrs/web/dwr/DWRRelationshipService.java
index 223eb26..c9530fb 100644
--- a/src/web/org/openmrs/web/dwr/DWRRelationshipService.java
+++ b/src/web/org/openmrs/web/dwr/DWRRelationshipService.java
@@ -37,7 +37,7 @@
 		rel.setPersonA(personA);
 		rel.setPersonB(personB);
 		rel.setRelationshipType(relType);
-		ps.createRelationship(rel);
+		ps.saveRelationship(rel);
 	}
 	
 	public void voidRelationship(Integer relationshipId, String voidReason) {
@@ -50,7 +50,7 @@
 		
 		Vector<RelationshipListItem> ret = new Vector<RelationshipListItem>();
 		List<Relationship> rels = Context.getPersonService()
-		        .getRelationships(Context.getPersonService().getPerson(personId));
+		        .getRelationshipsByPerson(Context.getPersonService().getPerson(personId));
 		for (Relationship rel : rels) {
 			if (!rel.isVoided()
 			        && (relationshipTypeId == null || rel.getRelationshipType().getRelationshipTypeId().equals(
