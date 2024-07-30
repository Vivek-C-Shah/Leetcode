class Solution(object):
    def setZeroes(self, matrix):
        """
        :type matrix: List[List[int]]
        :rtype: None Do not return anything, modify matrix in-place instead.
        """
        def markRow(matrix, n, m, i):
            for j in range(m):
                if matrix[i][j] != 0:
                    matrix[i][j] = 'a'

        def markCol(matrix, n, m, j):
            for i in range(n):
                if matrix[i][j] != 0:
                    matrix[i][j] = 'a'
        
        n = len(matrix)
        m = len(matrix[0])
        for i in range(n):
            for j in range(m):
                if matrix[i][j] == 0:
                    markRow(matrix, n, m, i)
                    markCol(matrix, n, m, j)
        for i in range(n):
            for j in range(m):
                if matrix[i][j] == 'a':
                    matrix[i][j] = 0
        return matrix