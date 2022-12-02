# Test project for RealWear Scrolling Issues

## Purpose
To create a test environment which we can share directly with external (non-PTC) parties
to help resolve technical questions / issues related to scroll behavior in the context of RealWear.

## Issues / Questions
- Priority (Low, Med, High): Description
- High: RecyclerView within RecyclerView in this implementation cannot be marked as non-scrollable in a 
  meaningful way such that scrollbar and scroll related system commands do not attach to the element.
  
  A solution to this problem would allow the text in the reference app to be scrollable while all other 
  elements are not focusable / scrollable.

- Med: Cannot setup a ScrollView which has a custom scrollbar which ties into system commands without
having conflicting RealWear scrollbar.

- Low: Offscreen content in RecyclerViews is detected and focusable (can be chosen for scrolling).
  (workaround related to manipulating offscreen components, not ideal and breaks some paradigms in android)
