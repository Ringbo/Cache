diff --git a/server/sonar-server/src/main/java/org/sonar/server/issue/index/IssueIndex.java b/server/sonar-server/src/main/java/org/sonar/server/issue/index/IssueIndex.java
index 4667cc9..3f3c66b 100644
--- a/server/sonar-server/src/main/java/org/sonar/server/issue/index/IssueIndex.java
+++ b/server/sonar-server/src/main/java/org/sonar/server/issue/index/IssueIndex.java
@@ -308,12 +308,12 @@
       esSearch.addAggregation(getResolutionFacet(query, options, filters, esQuery));
       esSearch.addAggregation(stickyFacetBuilder(esQuery, filters, IssueNormalizer.IssueField.ACTION_PLAN.field(), IssueFilterParameters.ACTION_PLANS));
       esSearch.addAggregation(stickyFacetBuilder(esQuery, filters, IssueNormalizer.IssueField.PROJECT.field(), IssueFilterParameters.COMPONENT_ROOTS,
-        query.componentRoots().toArray(new String[0])));
+        query.componentRoots().toArray()));
       esSearch.addAggregation(stickyFacetBuilder(esQuery, filters, IssueNormalizer.IssueField.RULE_KEY.field(), IssueFilterParameters.RULES,
-        query.rules().toArray(new String[0])));
+        query.rules().toArray()));
       esSearch.addAggregation(getAssigneesFacet(query, options, filters, esQuery));
       esSearch.addAggregation(stickyFacetBuilder(esQuery, filters, IssueNormalizer.IssueField.COMPONENT.field(), IssueFilterParameters.COMPONENTS,
-        query.components().toArray(new String[0])));
+        query.components().toArray()));
     }
   }
 
@@ -324,7 +324,7 @@
     // Same as in super.stickyFacetBuilder
     BoolFilterBuilder facetFilter = getStickyFacetFilter(esQuery, filters, fieldName);
     FilterAggregationBuilder facetTopAggregation = buildTopFacetAggregation(fieldName, facetName, facetFilter);
-    addSelectedItemsToFacet(fieldName, facetName, facetTopAggregation, query.assignees().toArray(new String[0]));
+    addSelectedItemsToFacet(fieldName, facetName, facetTopAggregation, query.assignees().toArray());
 
     // Add missing facet for unassigned issues
     facetTopAggregation.subAggregation(
@@ -345,7 +345,7 @@
     // Same as in super.stickyFacetBuilder
     BoolFilterBuilder facetFilter = getStickyFacetFilter(esQuery, filters, fieldName);
     FilterAggregationBuilder facetTopAggregation = buildTopFacetAggregation(fieldName, facetName, facetFilter);
-    addSelectedItemsToFacet(fieldName, facetName, facetTopAggregation, query.resolutions().toArray(new String[0]));
+    addSelectedItemsToFacet(fieldName, facetName, facetTopAggregation, query.resolutions().toArray());
 
     // Add missing facet for unresolved issues
     facetTopAggregation.subAggregation(
