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
        char nextStep = skill.charAt(order); // 다음에 배워야 할 스킬

        for (int i = 0; i < skillTree.length(); i++) {
            for (int j = 0; j < skill.length(); j++) {
                char selectedSkill = skill.charAt(j);

                if (skillTree.charAt(i) == selectedSkill) {
                    if (selectedSkill != nextStep) {
                        return false;
                    } else if (order < skill.length() - 1) {
                        order++;
                        nextStep = skill.charAt(order);
                    }
                }
            }
        }

        return true;
    }
}
