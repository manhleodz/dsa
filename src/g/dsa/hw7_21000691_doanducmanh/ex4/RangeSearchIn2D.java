package g.dsa.hw7_21000691_doanducmanh.ex4;

import java.util.ArrayList;
import java.util.List;

class RangeSearchIn2D {
    private Node root;

    public RangeSearchIn2D(List<Point> points) {
        root = buildTree(points, 0);
    }

    private Node buildTree(List<Point> points, int depth) {
        if (points.isEmpty()) {
            return null;
        }
        int axis = depth % 2;
        if (points.size() == 1) {
            return new Node(points.get(0));
        }
        points.sort((p1, p2) -> axis == 0 ? p1.x - p2.x : p1.y - p2.y);
        int mid = points.size() / 2;
        Node node = new Node(points.get(mid));
        node.left = buildTree(points.subList(0, mid), depth + 1);
        node.right = buildTree(points.subList(mid + 1, points.size()), depth + 1);
        return node;
    }

    public List<Point> rangeSearch(Point topLeft, Point bottomRight) {
        List<Point> result = new ArrayList<>();
        rangeSearch(root, topLeft, bottomRight, result, 0);
        return result;
    }

    private void rangeSearch(Node node, Point topLeft, Point bottomRight, List<Point> result, int depth) {
        if (node == null) {
            return;
        }
        if (node.point.x >= topLeft.x && node.point.x <= bottomRight.x && node.point.y >= topLeft.y && node.point.y <= bottomRight.y) {
            result.add(node.point);
        }
        int axis = depth % 2;
        if (axis == 0) {
            if (node.point.x >= topLeft.x && node.left != null) {
                rangeSearch(node.left, topLeft, bottomRight, result, depth + 1);
            }
            if (node.point.x <= bottomRight.x && node.right != null) {
                rangeSearch(node.right, topLeft, bottomRight, result, depth + 1);
            }
        } else {
            if (node.point.y >= topLeft.y && node.left != null) {
                rangeSearch(node.left, topLeft, bottomRight, result, depth + 1);
            }
            if (node.point.y <= bottomRight.y && node.right != null) {
                rangeSearch(node.right, topLeft, bottomRight, result, depth + 1);
            }
        }
    }
}
