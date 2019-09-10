class Solution {

    public int solution(String skill, String[] skillTrees) {
        int answer = 0;

        for (String skillTree : skillTrees) {
            if (isAvailable(skill, skillTree)) {
                answer++;
            }
        }

        return answer;
    }

    private boolean isAvailable(String skill, String skillTree) {
        int order = 0; // 학습 순서

        for (int i = 0; i < skillTree.length(); i++) {
            char selectedSkill = skillTree.charAt(i);

            if (skill.contains(String.valueOf(selectedSkill))) {
                if (selectedSkill == skill.charAt(order)) {
                    order++;
                } else {
                    return false;
                }
            }
        }

        return true;
    }
}
