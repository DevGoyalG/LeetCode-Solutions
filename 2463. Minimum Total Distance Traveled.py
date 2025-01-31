class Solution:
    def solve(self, rb, fc, i, j, dp):
        if i >= len(rb):
            return 0

        if j >= len(fc):
            return float('inf')

        if dp[i][j][fc[j][1]] != -1:
            return dp[i][j][fc[j][1]]

        not_take = self.solve(rb, fc, i, j + 1, dp)
        take = float('inf')

        if fc[j][1] > 0:
            distance = abs(rb[i] - fc[j][0])
            fc[j][1] -= 1  
            take = distance + self.solve(rb, fc, i + 1, j, dp)
            fc[j][1] += 1  

        dp[i][j][fc[j][1]] = min(take, not_take)
        return dp[i][j][fc[j][1]]

    def minimumTotalDistance(self, robot, factory):
        robot.sort()
        factory.sort()
        dp = [[[-1] * 101 for _ in range(len(factory))] for _ in range(len(robot))]
        return self.solve(robot, factory, 0, 0, dp)
