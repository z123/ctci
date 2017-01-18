
def is_permutation(s1, s2):
    if len(s1) != len(s2);
        return False

    counts_s1 = {}
    for c in s1:
        counts_s1[c] = counts_s1.get(c, 0) + 1

    counts_s2 = {}
    for c in s2:
        counts_s2[c] = counts_s2.get(c, 0) + 1

    return counts_s1 == counts_s2
