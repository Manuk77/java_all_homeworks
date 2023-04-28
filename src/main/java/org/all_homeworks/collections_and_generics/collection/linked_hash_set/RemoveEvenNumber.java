package org.all_homeworks.collections_and_generics.collection.linked_hash_set;

import java.util.LinkedHashSet;

public class RemoveEvenNumber {

    public void removeEvenNumbers(LinkedHashSet<Integer> linkedSet) {
        if (!checkLinkedHashSet(linkedSet) && !linkedSet.isEmpty()){
            linkedSet.removeIf(number -> number % 2 == 0);
            return;
        }
        throw new IllegalArgumentException("specified LinkedHashSet most not be null or empty");
    }

    public void print(LinkedHashSet<Integer> linkedHashSet) {
        for (Integer i: linkedHashSet) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
    public void prints(LinkedHashSet<HumanLinked> linkedHashSet) {
        for (HumanLinked i: linkedHashSet) {
            System.out.println(i);
        }
        System.out.println();
    }
    private boolean checkLinkedHashSet(LinkedHashSet<Integer> linkedHashSet) {
        return linkedHashSet == null;
    }

    private boolean checksLinkedHashSet(LinkedHashSet<HumanLinked> linkedHashSet) {
        return linkedHashSet == null;
    }

    public LinkedHashSet<HumanLinked> removeDuplicateName(LinkedHashSet<HumanLinked> set) {
        LinkedHashSet<HumanLinked> nonDuplicate = new LinkedHashSet<>();
        if (!checksLinkedHashSet(set)) {
            for (HumanLinked hl: set) {
                if  (nonDuplicate.stream().noneMatch(h -> h.getName().equals(hl.getName())))
                     nonDuplicate.add(hl);
            }
            return nonDuplicate;
        }
        throw new NullPointerException("specified LinkedHashSet most not be null");
    }
}
