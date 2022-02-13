class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
	int map = 0;
	for (char c : allowed.toCharArray()) {
		map |= 1 << c - 'a';
	}

	int count = 0;
	for (String word : words) {
		boolean consistent = true;
		for (char c : word.toCharArray()) {
			if ((map & (1 << c - 'a')) == 0) {
				consistent = false;
				break;
			}
		}
		count += consistent ? 1 : 0;
	}

	return count;
}
}